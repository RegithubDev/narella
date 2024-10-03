/*!
* Fawad Tariq (http://github.com/fawadtariq)
* Materialize Date Time Picker v0.1.1-beta
* Based on Materialize (http://materializecss.com)
*/

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

var MaterialDateTimePicker = {
    control: null,
    dateRange: null,
    pickerOptions: null,
    create: function (element) {
        this.control = element == undefined ? $('#' + localStorage.getItem('element')) : element;
        element = this.control;
        if (this.control.is("input[type='text']")) {
            //var defaultDate = new Date();
            element.off('click');
            element.datepicker({
                format: 'dd-mm-yyyy',
                // format: 'dd-mmm-yy',
                showMonthAfterYear: true,
                selectMonths: true,
                dismissable: false,
                autoClose: true,
                onOpen: datePickerSelectAddClass,
                onClose: function () {
                    var SelectedDate = document.getElementById(element.attr('id')).parentNode.querySelector(' .date-text').innerHTML;
                    var SelectedYear = document.getElementById(element.attr('id')).parentNode.querySelector(' .year-text').innerHTML
                    element.datepicker('destroy');
                    element.timepicker({
                        dismissable: false,
                        twelveHour: false,
                        format: "hh:ii:ss",
                        onOpenEnd: function () {
                            var CurrentElement = document.getElementById(element.attr('id')).parentNode;
                            var ContentHolder = CurrentElement.querySelector('.timepicker-digital-display');
                            if (!(ContentHolder.querySelectorAll('.date-holder').length > 0)) {
                                // main element created
                                var NewElement = document.createElement('div');
                                NewElement.classList.add('date-holder');
                                // year div created
                                var yearEle = document.createElement('div');
                                yearEle.setAttribute('id', 'yearSelected');
                                yearEle.classList.add('year-text');
                                yearEle.appendChild(document.createTextNode(SelectedYear + " "));
                                // date div created
                                var dateEle = document.createElement('div');
                                dateEle.setAttribute('id', 'dateSelected');
                                dateEle.classList.add('date-text');
                                dateEle.appendChild(document.createTextNode(SelectedDate));
                                // year,date divs added to main element
                                NewElement.appendChild(yearEle);
                                NewElement.appendChild(dateEle);
                                // inserted both divs before time
                                ContentHolder.insertBefore(NewElement, CurrentElement.querySelector(' .timepicker-text-container'));
                            }
                        },
                        onSelect: function (hr, min) {
                            element.attr('selectedTime', (hr + ":" + min).toString());
                        },
                        onCloseEnd: function () {
                            element.blur();
                        }
                    });
                    $('button.btn-flat.timepicker-close.waves-effect')[0].remove();

                    if (element.val() != "") {
                        element.attr('selectedDate', element.val().toString());
                    } else {
                        element.attr('selectedDate', element.val().toString());
                    }
                    element.timepicker('open');
                }
            });
            element.unbind('change');
            element.off('change');
            element.on('change', function () {
                if (element.val().indexOf(':') > -1) {
                    element.attr('selectedTime', element.val().toString());
                    element.val(element.attr('selectedDate') + " " + element.attr('selectedTime'));
                    element.attr('value', element.attr('selectedDate') + " " + element.attr('selectedTime'));
                    element.timepicker('destroy');
                    element.unbind('click');
                    element.off('click');
                    element.on('click', function (e) {
                        //element.val("");
                        element.removeAttr("selectedDate");
                        element.removeAttr("selectedTime");
                        localStorage.setItem('element', element.attr('id'));
                        MaterialDateTimePicker.create.call(element);
                        element.trigger('click');
                    });
                }
            });
            $('button.btn-flat.datepicker-cancel.waves-effect, button.btn-flat.datepicker-done.waves-effect').remove();
            return element;
        }
        else {
            console.error("The HTML Control provided is not a valid Input Text type.")
        }
    },
    addCSSRules: function () {
        $('html > head').append($('<style>div.modal-overlay { pointer-events:none; }</style>'));
    },
}


// this kind should add on time picker
// <style>
//     .date-holder{
//         color: white;
//         margin-top: 2rem;
//         font-size: 2rem;
//     }
//     .date-holder .date-text{
//         font-size: 2.5rem;
//         margin-top: 2rem;
//     }
// </style>
// <div class="date-holder">
//     <div id="yearSelected">2021</div>
//     <div class="date-text" id="dateSelected">Fri, Aug 27</div>
// </div>