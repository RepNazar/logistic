define(function () {
    return {
        rows: [
            {
                view: 'toolbar',
                cols: [
                    {
                        view: 'button',
                        label: 'Add',
                        click: function () {
                            var markList = $$('markList');
                            var id = markList.add({});
                            markList.editRow(id)
                        }
                    }
                ]
            },
            {
                id: 'markList',
                view: "datatable",
                autoheight: true,
                autowidth: true,
                columns: [
                    {id:"name", editor:"text"}
                ],
                editable: true,
                url: 'resource->/api/mark',
                save: 'resource->/api/mark'
            }
        ]
    }
})