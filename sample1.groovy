//  import groovy.xml.XmlSlurper

// def number = 0
// new File('data.txt').eachLine   { line ->
//     number++
//     println "$number: $line"
// }


// def classes = [String, List, File]

// for (clazz in classes) {
//     println clazz.package.name
// }

// println( [String, List, File]*.package.name)


// def customers = new XmlSlurper().parse(new File('customer.xml'))

// for (customer in customers.corporate.customer) {
//     println "${customer.@name} works in ${customer.@company}"
// }

// class Example {
//     static void main(String[] args) {
//         def num = 5
//         println 'Hello World! ' * num
//     }
// }

// List fibo = [1, 1]
// List gold = [1, 2]

// while (! isgolden( gold[-1])) {
//     fibo.add(fibo[-1] + fibo[-2])
//     gold.add(fibo[-1] / fibo[-2])
// }

// println "found golden ratio with fibo(${ fibo.SIZE-1}) as"

// println fibo[-1] + "/" + fibo[-2] + "=" + gold[-1]
// println "_" * 10 + "|" + "_" * (10 * gold[-1])

// def isgolden(candidate) {
//     def small = 1
//     def big = small * candidate
//     return  isCloseEnough( (small+big)/big, big/small)
// }

// def isCloseEnough(a, b) { return (a-b).abs() < 1.0e-9 }

// class Example1 {
//     static def DisplayName() {
//         println("This is sample text")
//         println "This is second line of sample text"
//     }
    
//     static void main(String[] args) {
//         DisplayName()
//     }
// }

// class Example2 {
//     static void sum(int a, int b) {
//         int c = a+b
//         println c
//     }

//     static void main(String[] args) {
//         sum(10,5)
//     }
// }

// class Example3 {
//     int x

//     public int getX() {
//         int lX = 120
//         println lX
//         return x
//     }

//     public int setX(int pX) {
//         this.x = pX
//     }

//     static void main(String[] args) {
//         Example3 ex = new Example3()
//         Example3 ex1 = new Example3()
//         ex.setX(130)
//         ex1.setX(150)
//         println ex.getX() 
//         println ex1.getX()
//     }
// }

// def arg = ["Groovy", "Java", "Python", "nodejs"]

// println arg.class //ArrayList

String str1 = "123"
String str2 = new String("1234")

if (str1 == str2) {
    println "equal"
}
else {
    println "Not equal"
}