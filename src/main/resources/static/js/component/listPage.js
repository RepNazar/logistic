define(function () {
    return function (tableId, url, columns) {
        return {
            rows: [
                {
                    view: 'toolbar',
                    cols: [
                        {
                            view: 'button',
                            label: 'Add',
                            click: function () {
                                var markList = $$(tableId);
                                var id = markList.add({});
                                markList.editRow(id)
                            }
                        }
                    ]
                },
                {
                    id: tableId,
                    view: 'datatable',
                    autoheight: true,
                    autowidth: true,
                    columns: columns,
                    editable: true,
                    url: url,
                    save: url,
                    pager: 'tablePager',
                    datafetch: 3
                },
                {
                    view: 'pager',
                    id: 'tablePager',
                    size: 3,
                    group: 3,
                    template: '{common.first()}{common.prev()}{common.pages()}{common.next()}{common.last()}'
                }
            ]
        }
    }
});