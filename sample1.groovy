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

// String str1 = "123"
// String str2 = new String("1234")

// if (str1 == str2) {
//     println "equal"
// }
// else {
//     println "Not equal"
// }

// assert (true)
// assert 1 == 1

// class Book {
//     private String title
//     Book (String theTitle) {
//         title = theTitle
//     }
//     String getTitle() {
//         return title
//     }
// }

// Book gina = new Book('Groovy in Action')

// assert gina.getTitle() == 'Groovy in Action'
// assert getTitleBackwwards(gina) == 'noitcA ni yvoorG'

// String getTitleBackwwards(book) {
//     String title = book.getTitle()
//     return title.reverse()
// }


// @Grab('commons-lang:commons-lang:2.4')
// import org.apache.commons.lang.ClassUtils

// class Outer {
//     class Inner {}
// }

// assert !ClassUtils.isInnerClass(Outer)
// assert ClassUtils.isInnerClass(Outer.Inner)

// [1, 2, 3].each {entry -> println entry }        // prints each item in the list

// def totalclicks = 0
// def partypeople = 100
// 1.upto(partypeople) {guestnumber ->
//                      clinkswithguest = guestnumber-1
//                      totalclicks += clinkswithguest
//                      }
// println totalclicks
// assert totalclicks == (partypeople * (partypeople-1)) /2

// Scanner scan = new Scanner(System.in)
// String s = scan.nextLine()
// println s

// import java.awt.*

// Point topLeft = new Point(0, 0)
// Point botRight = [100, 100]
// Point center = [x:50, y:50]

// assert botRight instanceof Point
// assert center instanceof Point

// def rect = new Rectangle()
// rect.location = [0, 0]
// rect.size = [width:100, height:100]

// println rect


class Person {
    def firstName
    def lName
    def age
    def getFirstName() {
        firstName
    }
    def getLName() {
        lName
    }
    def getAge() {
        age
    }
    def getFullName() {
        firstName + ' ' + lName
    }
}

def person = new Person(firstName: 'test', lName: '123', age: 23)

println "${person.getFullName()}"
println "${person.getFullName().getClass().name}"

def multi_line_string  = """ This is a multiline 
string assigning to the mult_line_string object
"""

println "${multi_line_string}"