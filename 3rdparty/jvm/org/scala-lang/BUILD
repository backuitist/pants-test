REV = '2.11.4'

def make_lib(name):
  jar_library(name=name,
  jars=[
    jar(org='org.scala-lang', name=name, rev=REV).with_sources()
  ]
)

make_lib('scala-compiler')
make_lib('scala-library')