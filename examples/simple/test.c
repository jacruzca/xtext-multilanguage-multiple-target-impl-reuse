to "TO1" {
	attribute "attrName1" TYP1
	attribute "attrName2" TYP2
}

to "TO2" {
	attribute "attrName1" TYP1
	attribute "attrName2" TYP2
}

service Service1 {
	returns "TO1"
	totalParams 1
	paramsType Test2
}

service Service2 {
	returns "TO2"
	totalParams 5
	paramsType Test
}