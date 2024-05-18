/* groovylint-disable NoDef */
/* groovylint-disable-next-line CompileStatic, JavaIoPackageAccess, VariableTypeRequired */
def number = 0
/* groovylint-disable-next-line JavaIoPackageAccess */
new File('data.txt').eachLine   { line ->
    number++
    println "$number: $line"
}


def classes = [String, List, File]

for (clazz in classes) {
    println clazz.package.name
}

println( [String, List, File]*.package.name)