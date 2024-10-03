// this one is jut to wait for the page to load
	document.addEventListener('DOMContentLoaded', () => {
	    const theme = document.getElementById('theme');
	    const themeToggle = document.getElementById('theme-change');
	    themeToggle.addEventListener('click', () => {
	        // if it's light -> go dark
	        if (themeToggle.children[0].classList.contains("fa-moon-o")) {
	            theme.href = '/mrvc/resources/new/css/light-theme.css';
	            themeToggle.style.backgroundColor = "white";
	            themeToggle.children[0].classList.add('fa-sun-o');
	            themeToggle.children[0].classList.remove('fa-moon-o');
	            document.cookie = "theme=light";
	        } else {
	            // if it's dark -> go light
	            theme.href = '/mrvc/resources/new/css/dark-theme.css';
	            themeToggle.style.backgroundColor = "black";
	            themeToggle.children[0].classList.add('fa-moon-o');
	            themeToggle.children[0].classList.remove('fa-sun-o');
	            document.cookie = "theme=dark";
	        }
	    })
	    var x = document.cookie;
		
	    if(x.includes("dark")){
	    	theme.href = '/mrvc/resources/new/css/dark-theme.css';
            themeToggle.style.backgroundColor = "black";
            themeToggle.children[0].classList.add('fa-moon-o');
            themeToggle.children[0].classList.remove('fa-sun-o');
            document.cookie = "theme=dark";
	    }else{
	    	theme.href = '/mrvc/resources/new/css/light-theme.css';
            themeToggle.style.backgroundColor = "white";
            themeToggle.children[0].classList.add('fa-sun-o');
            themeToggle.children[0].classList.remove('fa-moon-o');
            document.cookie = "theme=light";
	    }
	    
	});
