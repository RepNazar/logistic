define(function () {
    var ajax = webix.ajax().headers({
        'Content-type': 'application/json'
    });

    webix.proxy.resource = {
        init: function () {
            webix.extend(this, webix.proxy.rest);
        },
        load: function (view, params) {
            return ajax.get(view.config.url.source).then(function (value) {
                return value.json().content
            });
        },
        save: function (view, params) {
            var id = params.id
            var url = view.config.url.source
            if (params.operation === 'update') {
                return ajax.put(url + '/' + id, params.data)
            } else if (params.operation === 'insert') {
                delete params.data.id;
                return ajax.post(url, params.data)
            } else if (params.operation === 'delete') {
                return ajax.del(url + '/' + id)
            }
        }
    }
})