# ![TOAST UI Editor](https://uicdn.toast.com/toastui/img/tui-editor-bi.png)

> Java OCP 17 - Guidelines

[![github release version](https://img.shields.io/github/v/release/nhn/tui.editor.svg?include_prereleases)]

<img src="https://user-images.githubusercontent.com/37766175/121809054-446bac80-cc96-11eb-9139-08c6d9ad2d88.png" />


## 🚩 Table of Contents

- [Building Blocks](#-building-blocks)
- [Why TOAST UI Editor?](#-why-toast-ui-editor)
- [Features](#-features)
- [Examples](#-examples)
- [Browser Support](#-browser-support)
- [Pull Request Steps](#-pull-request-steps)
- [Contributing](#-contributing)
- [TOAST UI Family](#-toast-ui-family)
- [Used By](#-used-by)
- [License](#-license)


## 📦 Building Blocks

### Object

| Name 		| Description 						| Java Doc |
| --- 		| --- 		  								| --- 	|
| Class  	| Basic building block in Java 				| POJO |
| Object 	| Instance of a Java Class 					| Main Java Class  |
| Field  	| Holds the state of a Program 				| Member of a Class |
| Method 	| Operate over fields/variables 			| Member of a Class |
| Void 		| Means not value will returned at All | Return Type |
| Statement | Instruction | --- |
| Package 	| Logical groupoing classes | Organization website in reverse |
| Import 	| Tells Java which packages to look for classes | --- |
| Static Import | Static members of a class known | --- |
| Wildcard | * Matches all classes in a package (one use in a class) | Can shorten the import lists |

### Class

* **Nested classes** : if exists 1 or more classes in the same file, one top-level should be public.
* **Filename** : Should match with the class name identifier (Case sensitive).

### Method

Signature components:
* **Name** : identifier of Method.
* **Parameter** : Information required by method when Its being called.

* **main()** : Starting point of the program - EntryPoint.

### Comments

Signature components:

* **Single Line** : //
* **Multiline** : /** */ (Javadoc use)



### Access Modifiers (Level of expousure)

| Name 		| Description 						|
| --- 		| --- 		  								|
| **public**  		| Accesible from anywhere				  |
| **private** 		| Accessible whithin declared class		  |
| **protected**  	| Accessible within the same package or subclasses in different packages |
| **default** 		| Accessible only within the same package |

### ✳️ **Data types**

### Primitives

| Keyword 	| Type | Min | Max | Default| Example  |
| --- 		| ---  | --- | --- | ---    | ---      |
| **boolean**	| true or false			| n/a			 |	n/a			  	| false  |	true    |
| **byte**		| 8-bit integral value	| -128			 |	127			  	| 0      |	123     |
| **short**		| 16-bit integral value	| -32,768		 |	32,767		  	| 0      |	123     |
| **int**		| 32-bit integral value	| -2,147,483,648 |	2,147,483,647 	| 0 	 |	123     |
| **long**		| 64-bit integral value	| -2^63	 		 |	263^63 – 1 		| 0L 	 |	123L    |
| **float**		| 32-bit floating-point value|	n/a		 | n/a	 			| 0.0f 	 |	123.45f |
| **double**	| 64-bit floating-point	value|  n/a		 | n/a	 			| 0.0 	 |	123.456 |
| **char**		| 16-bit Unicode value	|	0			 |	65,535		    | \u0000 |	'a' 	|


### Var args 

Variable argument lists.

| Types|
| ---  |
| **String[] args** 		| 
| **String options[]** 		|
| **String ... elements** 	|

## 🔧 Pull Request Steps
You can see your code reflected as soon as you save the code by running a server. Don't miss adding test cases and then make green rights.

#### Run webpack-dev-server
If testing of legacy browsers is required, the development server can still be run using a [webpack](https://webpack.js.org/).

``` sh
$ npm run serve:ie editor
```

#### Run test

``` sh
$ npm test editor
```


