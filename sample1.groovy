import groovy.xml.XmlSlurper

def number = 0
new File('data.txt').eachLine   { line ->
    number++
    println "$number: $line"
}


def classes = [String, List, File]

for (clazz in classes) {
    println clazz.package.name
}

println( [String, List, File]*.package.name)


def customers = new XmlSlurper().parse(new File('customer.xml'))

for (customer in customers.corporate.customer) {
    println "${customer.@name} works in ${customer.@company}"
}