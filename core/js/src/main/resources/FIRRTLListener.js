// Generated from FIRRTL.g4 by ANTLR 4.7
// jshint ignore: start
var antlr4 = require('antlr4/index');

// This class defines a complete listener for a parse tree produced by FIRRTLParser.
function FIRRTLListener() {
	antlr4.tree.ParseTreeListener.call(this);
	return this;
}

FIRRTLListener.prototype = Object.create(antlr4.tree.ParseTreeListener.prototype);
FIRRTLListener.prototype.constructor = FIRRTLListener;

// Enter a parse tree produced by FIRRTLParser#circuit.
FIRRTLListener.prototype.enterCircuit = function(ctx) {
};

// Exit a parse tree produced by FIRRTLParser#circuit.
FIRRTLListener.prototype.exitCircuit = function(ctx) {
};


// Enter a parse tree produced by FIRRTLParser#module.
FIRRTLListener.prototype.enterModule = function(ctx) {
};

// Exit a parse tree produced by FIRRTLParser#module.
FIRRTLListener.prototype.exitModule = function(ctx) {
};


// Enter a parse tree produced by FIRRTLParser#port.
FIRRTLListener.prototype.enterPort = function(ctx) {
};

// Exit a parse tree produced by FIRRTLParser#port.
FIRRTLListener.prototype.exitPort = function(ctx) {
};


// Enter a parse tree produced by FIRRTLParser#dir.
FIRRTLListener.prototype.enterDir = function(ctx) {
};

// Exit a parse tree produced by FIRRTLParser#dir.
FIRRTLListener.prototype.exitDir = function(ctx) {
};


// Enter a parse tree produced by FIRRTLParser#type.
FIRRTLListener.prototype.enterType = function(ctx) {
};

// Exit a parse tree produced by FIRRTLParser#type.
FIRRTLListener.prototype.exitType = function(ctx) {
};


// Enter a parse tree produced by FIRRTLParser#field.
FIRRTLListener.prototype.enterField = function(ctx) {
};

// Exit a parse tree produced by FIRRTLParser#field.
FIRRTLListener.prototype.exitField = function(ctx) {
};


// Enter a parse tree produced by FIRRTLParser#defname.
FIRRTLListener.prototype.enterDefname = function(ctx) {
};

// Exit a parse tree produced by FIRRTLParser#defname.
FIRRTLListener.prototype.exitDefname = function(ctx) {
};


// Enter a parse tree produced by FIRRTLParser#parameter.
FIRRTLListener.prototype.enterParameter = function(ctx) {
};

// Exit a parse tree produced by FIRRTLParser#parameter.
FIRRTLListener.prototype.exitParameter = function(ctx) {
};


// Enter a parse tree produced by FIRRTLParser#moduleBlock.
FIRRTLListener.prototype.enterModuleBlock = function(ctx) {
};

// Exit a parse tree produced by FIRRTLParser#moduleBlock.
FIRRTLListener.prototype.exitModuleBlock = function(ctx) {
};


// Enter a parse tree produced by FIRRTLParser#simple_reset0.
FIRRTLListener.prototype.enterSimple_reset0 = function(ctx) {
};

// Exit a parse tree produced by FIRRTLParser#simple_reset0.
FIRRTLListener.prototype.exitSimple_reset0 = function(ctx) {
};


// Enter a parse tree produced by FIRRTLParser#simple_reset.
FIRRTLListener.prototype.enterSimple_reset = function(ctx) {
};

// Exit a parse tree produced by FIRRTLParser#simple_reset.
FIRRTLListener.prototype.exitSimple_reset = function(ctx) {
};


// Enter a parse tree produced by FIRRTLParser#reset_block.
FIRRTLListener.prototype.enterReset_block = function(ctx) {
};

// Exit a parse tree produced by FIRRTLParser#reset_block.
FIRRTLListener.prototype.exitReset_block = function(ctx) {
};


// Enter a parse tree produced by FIRRTLParser#stmt.
FIRRTLListener.prototype.enterStmt = function(ctx) {
};

// Exit a parse tree produced by FIRRTLParser#stmt.
FIRRTLListener.prototype.exitStmt = function(ctx) {
};


// Enter a parse tree produced by FIRRTLParser#memField.
FIRRTLListener.prototype.enterMemField = function(ctx) {
};

// Exit a parse tree produced by FIRRTLParser#memField.
FIRRTLListener.prototype.exitMemField = function(ctx) {
};


// Enter a parse tree produced by FIRRTLParser#simple_stmt.
FIRRTLListener.prototype.enterSimple_stmt = function(ctx) {
};

// Exit a parse tree produced by FIRRTLParser#simple_stmt.
FIRRTLListener.prototype.exitSimple_stmt = function(ctx) {
};


// Enter a parse tree produced by FIRRTLParser#suite.
FIRRTLListener.prototype.enterSuite = function(ctx) {
};

// Exit a parse tree produced by FIRRTLParser#suite.
FIRRTLListener.prototype.exitSuite = function(ctx) {
};


// Enter a parse tree produced by FIRRTLParser#when.
FIRRTLListener.prototype.enterWhen = function(ctx) {
};

// Exit a parse tree produced by FIRRTLParser#when.
FIRRTLListener.prototype.exitWhen = function(ctx) {
};


// Enter a parse tree produced by FIRRTLParser#info.
FIRRTLListener.prototype.enterInfo = function(ctx) {
};

// Exit a parse tree produced by FIRRTLParser#info.
FIRRTLListener.prototype.exitInfo = function(ctx) {
};


// Enter a parse tree produced by FIRRTLParser#mdir.
FIRRTLListener.prototype.enterMdir = function(ctx) {
};

// Exit a parse tree produced by FIRRTLParser#mdir.
FIRRTLListener.prototype.exitMdir = function(ctx) {
};


// Enter a parse tree produced by FIRRTLParser#ruw.
FIRRTLListener.prototype.enterRuw = function(ctx) {
};

// Exit a parse tree produced by FIRRTLParser#ruw.
FIRRTLListener.prototype.exitRuw = function(ctx) {
};


// Enter a parse tree produced by FIRRTLParser#exp.
FIRRTLListener.prototype.enterExp = function(ctx) {
};

// Exit a parse tree produced by FIRRTLParser#exp.
FIRRTLListener.prototype.exitExp = function(ctx) {
};


// Enter a parse tree produced by FIRRTLParser#id.
FIRRTLListener.prototype.enterId = function(ctx) {
};

// Exit a parse tree produced by FIRRTLParser#id.
FIRRTLListener.prototype.exitId = function(ctx) {
};


// Enter a parse tree produced by FIRRTLParser#fieldId.
FIRRTLListener.prototype.enterFieldId = function(ctx) {
};

// Exit a parse tree produced by FIRRTLParser#fieldId.
FIRRTLListener.prototype.exitFieldId = function(ctx) {
};


// Enter a parse tree produced by FIRRTLParser#intLit.
FIRRTLListener.prototype.enterIntLit = function(ctx) {
};

// Exit a parse tree produced by FIRRTLParser#intLit.
FIRRTLListener.prototype.exitIntLit = function(ctx) {
};


// Enter a parse tree produced by FIRRTLParser#keywordAsId.
FIRRTLListener.prototype.enterKeywordAsId = function(ctx) {
};

// Exit a parse tree produced by FIRRTLParser#keywordAsId.
FIRRTLListener.prototype.exitKeywordAsId = function(ctx) {
};


// Enter a parse tree produced by FIRRTLParser#primop.
FIRRTLListener.prototype.enterPrimop = function(ctx) {
};

// Exit a parse tree produced by FIRRTLParser#primop.
FIRRTLListener.prototype.exitPrimop = function(ctx) {
};



exports.FIRRTLListener = FIRRTLListener;