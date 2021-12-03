// const readline = require('readline')
// const readline = require('readline').createInterface({
//     input: process.stdin,
//     output: process.stdout
//   })
  
//   readline.question(`What's your name?`, name => {
//     console.log(`Hi ${name}!`)
//     readline.close()
//   })


const my =  process.argv.slice(2);
// const args = process.argv.slice(2)

my.forEach(element => {
    if(element < 0){
        console.log(element)
    }
});






