
// problem
case object DbConnection

def method(block: => Unit)(connection: DbConnection.type) = {
  // execute block of code
}

method(/*somecode*/)(DbConnection)

// solution

implicit val connection = DbConnection

method(/*SOmeCode*/)