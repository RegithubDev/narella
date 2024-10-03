<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<button class="btn btn-primary btn-icon scroll-top" type="button"><i data-feather="arrow-up"></i></button>
    <!-- END: Footer-->
                     <div id="hideIdelDIv" class="swal2-container swal2-center swal2-backdrop-show" style="overflow-y: auto; display:none;">
                       <div aria-labelledby="swal2-title" aria-describedby="swal2-html-container" class="swal2-popup swal2-modal swal2-show" tabindex="-1" role="dialog" aria-live="assertive" aria-modal="true" style="display: grid;">
                       <button type="button" class="swal2-close" aria-label="Close this dialog" style="display: none;">×</button>
                       <ul class="swal2-progress-steps" style="display: none;"></ul>
                       <div class="swal2-icon" style="display: none;"></div>
                       <img class="swal2-image" style="display: none;"><div id="timer"></div>
                       <h2 class="swal2-title" id="swal2-title" style="display: block;">No User Activity found!</h2>
                       <div class="swal2-html-container" style="display: block;">Are You Still Connected ?</div>
                       <input class="swal2-input" style="display: none;"><input type="file" class="swal2-file" style="display: none;">
                       <div class="swal2-range" style="display: none;"><input type="range"><output></output></div>
                       <div class="swal2-radio" style="display: none;"></div><label for="swal2-checkbox" class="swal2-checkbox" style="display: none;"><input type="checkbox">
                       <span class="swal2-label"></span></label><textarea class="swal2-textarea" style="display: none;"></textarea>
                       <div class="swal2-actions">
                       <div class="swal2-loader"></div><button type="button" class="swal2-confirm btn btn-primary" aria-label="" style="display: inline-block;">Yes</button></div>
                       <div class="swal2-footer" style="display: none;"></div><div class="swal2-timer-progress-bar-container"><div class="swal2-timer-progress-bar" style="display: none;"></div></div></div></div>

<script>

var timer2 = "5:25";
$(document).ready(function () {
	var idleState = false;
	var idleTimer = null;
	var interval = null;
    $('*').bind('mousemove click mouseup mousedown keydown keypress keyup submit change mouseenter scroll resize dblclick', function () {
        clearTimeout(idleTimer);
        if (idleState == true) { 
  
        }
        idleState = false;
        idleTimer = setTimeout(function () { 
        	if($('#hideIdelDIv').is(':hidden')){
        		$('#hideIdelDIv').css('display : block;');
            	$('#hideIdelDIv').show();
            	timerMethod(timer2)
                idleState = true; 
        	}
        }, 50000);
    });
    $("body").trigger("mousemove");
   
});
function timerMethod(timer2){
	
	 interval = setInterval(function() {
		if(timer2 != null && timer2 != '')
		    var timer = timer2.split(':');
		    //by parsing integer, I avoid all extra string processing
		    var minutes = parseInt(timer[0], 10);
		    var seconds = parseInt(timer[1], 10);
		    --seconds;
		    minutes = (seconds < 0) ? --minutes : minutes;
		    console.log(minutes, seconds);
		    seconds = (seconds < 0) ? 59 : seconds;
		    seconds = (seconds < 10) ? '0' + seconds : seconds;
		    //minutes = (minutes < 10) ?  minutes : minutes;
		    if (minutes < 0) {
		        //clearInterval(interval);
		    } else {
		        $('#timer').html(minutes + ':' + seconds);
		        timer2 = minutes + ':' + seconds;
		    } 
		    if(seconds == 0){
		    	 $("#email").val('');
				// $("#logoutForm").submit();
		    }
	}, 1000);
}

$('.swal2-confirm').on('click',  function(){
	$('#hideIdelDIv').hide();
	 $('#timer').html('');
	 clearInterval(interval);
});
</script>
</body>
</html>