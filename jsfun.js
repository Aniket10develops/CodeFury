function alertraiser() {
    var x = document.getElementById("uname").value;
    var c = document.getElementById("pwd").value;
    var d = document.getElementById("cpwd").value;
    var b = true;
    if (x.length <= 6) {

        document.getElementById("err").innerHTML = "<p class='text-danger font-italic'>Username should be of length more than 6.!!!</p>";
        b = false;
    }
    if (c == "") {
        document.getElementById("perr").innerHTML = "<p class='text-danger font-italic'>Password field should not be empty, as it is a mandatory field !!!</p>";
        b = false;
    }

    if (c == d) {
        document.getElementById("cperr").innerHTML = "<p class='text-danger font-italic'>Password entered is not matching!!!</p>";
        b = false;
    }
    return b;
}

function alertraiser2() {

    var ln = document.getElementById("lname").value;
    var lp = document.getElementById("lpwd").value;
    var b = true;

    if (ln.length <= 6) {

        document.getElementById("lnerr").innerHTML = "<p class='text-danger font-italic'>Username should be of length more than 6.!!!</p>";
        b = false;
    }

    if (lp == "") {
        document.getElementById("lperr").innerHTML = "<p class='text-danger font-italic'>Password field should not be empty, as it is a mandatory field !!!</p>";
        b = false;
    }
    return b;
}

function resetter() {
    document.getElementById("myform").reset();
    document.getElementById("err").innerHTML = "";
    document.getElementById("perr").innerHTML = "";
}

function showsignup() {
    let h = document.getElementById("r");
    h.removeAttribute("hidden");
}

function showlogin() {
    let h = document.getElementById("formf");
    h.removeAttribute("hidden");
}

function hidelogin() {
    let h = document.getElementById("formf");
    h.setAttribute("hidden", true);
}

function hidesignup() {
    let h = document.getElementById("r");
    h.setAttribute("hidden", true);
}

function signup() {

    var x = document.getElementById("switch").checked;

    if (x) {
        showsignup();
        hidelogin();


    } else {
        showlogin();
        hidesignup();


    }

}