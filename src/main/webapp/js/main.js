var antlr4 = require('antlr4/index');
var TodoLexer = require('js/JSettlersLexer');
var TodoParser = require('js/JSettlersParser');
document.getElementById("parse").addEventListener("click", function(){
    var input = document.getElementById("code").value;
    var chars = new antlr4.InputStream(input);
    var lexer = new TodoLexer.todoLexer(chars);
    var tokens  = new antlr4.CommonTokenStream(lexer);
    var parser = new TodoParser.todoParser(tokens);
    parser.buildParseTrees = true;
    var tree = parser.elements();
    console.log("Parsed: "+ tree);
});