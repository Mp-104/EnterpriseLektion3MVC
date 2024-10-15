function test () {
    alert("Does this work")
}

function test2 () {
    alert("This does work")
}

function pressButtonHelloWorld () {

    fetch('http://localhost:8080/greet')
        .then(response => response.text())
        .then(data => {
            document.getElementById('greetResponse').innerText = data;
        })
        .catch(error => {
            console.error('Error:', error);
        });

};
