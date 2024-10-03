// adding dropdown class to datepicker on its opening
var datePickerSelectAddClass = function () {
    var self = this;
    setTimeout(function () {
        var selector = self.el;
        if (!selector) {
            selector = ".datepicker"
        }
        $(selector).siblings(".datepicker-modal")
            .find(".select-dropdown.dropdown-trigger")
            .each((index, item) => {
                var dateDropdownID = $(item).attr("data-target");
                var dropdownUL = $('#' + dateDropdownID);
                dropdownUL.children("li").on("click", () => {
                    datePickerSelectAddClass();
                });
                dropdownUL.addClass("datepicker-dropdown-year-month")
            });
    }, 500);
};

// finding all datepickers in page and initialize them
// var date_pickers = document.querySelectorAll('.datepicker');
$(document).on('focus', '.datepicker', function () {
    var dt = this.value.split(/[^0-9]/);
    this.value = "";
    var options = {
        format: 'dd-mm-yyyy',
        autoClose: true,
        onOpen: datePickerSelectAddClass,
        showClearBtn: true,
        onClose: function () {
            if (!$(this.el).val()) {
                $(this.el).siblings('label').removeClass('active');
            }
        }
    };
    if (dt.length > 1) {
        options.setDefaultDate = true,
            options.defaultDate = new Date(dt[2], dt[1] - 1, dt[0])
    }
    M.Datepicker.init(this, options);
});

// fire datepicker event when the respective btn clicks
$(document).on('focus', '.datepicker-button', function () {
    var dateId = $(this).attr('id').split("_i")[0];
    // $('#' + dateId).datepicker({
    //     format: 'dd-mm-yyyy',
    //     autoClose: true,
    //     onOpen: datePickerSelectAddClass
    // });
    // $('#' + dateId).datepicker('open');
    //this.value = "";
    // var dt = $('#' + dateId).val().split(/[^0-9]/);
    // var options = {
    //     format: 'dd-mm-yyyy',
    //     autoClose: true,
    //     onOpen: datePickerSelectAddClass,
    //     showClearBtn: true,
    //     onClose: function () {
    //         if (!$(this.el).val()) {
    //             $(this.el).siblings('label').removeClass('active');
    //         }
    //     }
    // };
    // if (dt.length > 1) {
    //     options.setDefaultDate = true,
    //         options.defaultDate = new Date(dt[2], dt[1] - 1, dt[0])
    // }
    // M.Datepicker.init($('#' + dateId), options);
    $('#' + dateId).focus().click();
});
