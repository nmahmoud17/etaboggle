var interval;

function countdown() {
    clearInterval(interval);
    interval = setInterval( function() {
        var timer = $('.js-timeout').html();
        timer = timer.split(':');
        var minutes = timer[0];
        var seconds = timer[1];
        seconds -= 1;
        if (minutes < 0) return;
        else if (seconds < 0 && minutes != 0) {
            minutes -= 1;
            seconds = 59;
        }
        else if (seconds < 10 && length.seconds != 2) seconds = '0' + seconds;

        $('.js-timeout').html(minutes + ':' + seconds);

        if (minutes == 0 && seconds == 0) clearInterval(interval);
    }, 1000);
}

$('#js-startTimer').click(function () {
    $('.js-timeout').text("2:00");
    countdown();
});

$('#js-resetTimer').click(function () {
    $('.js-timeout').text("2:00");
    clearInterval(interval);
});

$(function () {
    $('.button').on('click', function () {
        var text = $('.form2');
        text.val(text.val() + 'D');
    });
});

$(function () {
    $('.button2').on('click', function () {
        var text = $('.form2');
        text.val(text.val() + 'L');
    });
});

$(function () {
    $('.button3').on('click', function () {
        var text = $('.form2');
        text.val(text.val() + 'P');
    });
});
$(function () {
    $('.button4').on('click', function () {
        var text = $('.form2');
        text.val(text.val() + 'A');
    });
});
$(function () {
    $('.button5').on('click', function () {
        var text = $('.form2');
        text.val(text.val() + 'E');
    });
});
$(function () {
    $('.button6').on('click', function () {
        var text = $('.form2');
        text.val(text.val() + 'I');
    });
});
$(function () {
    $('.button7').on('click', function () {
        var text = $('.form2');
        text.val(text.val() + 'T');
    });
});
$(function () {
    $('.button8').on('click', function () {
        var text = $('.form2');
        text.val(text.val() + 'G');
    });
});
$(function () {
    $('.button9').on('click', function () {
        var text = $('.form2');
        text.val(text.val() + 'O');
    });
});

$(function () {
    $('.button10').on('click', function () {
        var text = $('.form2');
        text.val(text.val() + 'N');
    });
});


$(function () {
    $('.button11').on('click', function () {
        var text = $('.form2');
        text.val(text.val() + 'U');
    });
});

$(function () {
    $('.button12').on('click', function () {
        var text = $('.form2');
        text.val(text.val() + 'N');
    });
});

$(function () {
    $('.button13').on('click', function () {
        var text = $('.form2');
        text.val(text.val() + 'O');
    });
});
$(function () {
    $('.button14').on('click', function () {
        var text = $('.form2');
        text.val(text.val() + 'Q');
    });
});
$(function () {
    $('.button15').on('click', function () {
        var text = $('.form2');
        text.val(text.val() + 'E');
    });
});
$(function () {
    $('.button16').on('click', function () {
        var text = $('.form2');
        text.val(text.val() + 'U');
    });
});