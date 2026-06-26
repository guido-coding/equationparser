# **Equation parser**

Algorithm for computing the solution of equations that are passed as text. Named variables and various mathematical operations are supported.
Supported operators are ^ (power), +, -, *, /, sin, asin, cos, acos, tan, atan, log (log10), mod (modulus), sqrt (square root), (, ).
Equation variable names can be used but cannot start with numbers or contain symbols * / - + ^ ( ) .
White spaces in the equation are ignored.
Floating point numbers can be used, "." should be used as the decimal separation symbol.
Based on the [Shunting Yard algorithm](https://en.wikipedia.org/wiki/Shunting_yard_algorithm).

## Code examples
Code can be called as:

**Method 1:**
```
String equation = "x^2 + y";
Map<String, Double> varValues = new HashMap<String, Double>();
varValues.put("x", 1.0);
varValues.put("y", -1.0);
try {
	double value = EquationParser.resolveEquation(equation, varValues);
} catch (InvalidEquationException e) {}
```

**Method 2:**
```
String equation = "4^2+3.5";
try {
	double value = EquationParser.resolveEquation(equation);
} catch (InvalidEquationException e) {}
```

**Method 3:**
```
String equation = "x^2 + y";
Map<String, Double> varValues = new HashMap<String, Double>();
varValues.put("x", 1.0);
varValues.put("y", -1.0);

try {
	EquationParser parser = new EquationParser(equation);
	double value = parser.resolveEquation(varValues);
} catch (InvalidEquationException e) {}
```

**Method 4:**
```
String equation = "4^2+3.5";
try {
	EquationParser parser = new EquationParser(equation);
	double value = parser.resolveEquation();
} catch (InvalidEquationException e) {}

```

