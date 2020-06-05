requirejs.config({
    baseUrl: 'js'
});


function buildRoute(view) {
    return function () {
        webix.ui({
            id: 'root',
            rows: [view]
        }, $$('root'))
    }
}

function buildButton(label, route) {
    return {
        view: 'button',
        value: label,
        width: 100,
        align: 'center',
        click: function() {
            routie(route)
        }
    }
}

require(['views/main', 'views/cars', 'views/marks', 'views/models', 'util/resourceProxy'],
    function (main, cars, marks, models, resourceProxy) {
        webix.ready(function () {
            webix.ui({
                container: 'app',
                height: document.body.clientHeight,
                width: document.body.clientWidth,
                rows: [
                    {
                        view: 'toolbar',
                        cols: [
                            buildButton('Home', ''),
                            buildButton('Marks', 'marks'),
                            buildButton('Models', 'models'),
                            buildButton('Cars', 'cars')
                        ]
                    },
                    {
                        id: 'root'
                    }
                ]
            })
        });

        routie({
            '': buildRoute(main),
            'marks': buildRoute(marks),
            'models': buildRoute(models),
            'cars': buildRoute(cars)
        })
    });
