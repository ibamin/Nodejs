const express = require('express')
const app = express()
const port =3000

app.get('/',(req,res)=>{
    res.send("Hello world")
})

app.listen(port,()=>{
    console.log(`Server on http://localhost:${port}`)
})