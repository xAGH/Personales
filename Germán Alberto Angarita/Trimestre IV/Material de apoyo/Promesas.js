const num =  3;
const  promesa = new Promise(function (resolve, reject) {
    if (num == 5) {
        setTimeout(function () {
            resolve('Todo correcto');
        }, 2000);
    }
    else {
        reject(Error('Algo malo ha sucedido.'));
    }
        reject(Error('Algo malo ha sucedido.'));
});
promesa
    .then(function (resolve) {
    console.log(resolve);
})["catch"](function (error) {
    console.log(error);
});
