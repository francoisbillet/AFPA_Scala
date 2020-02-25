import scala.util.matching.Regex

object encode {

    def main(args: Array[String]): Unit = {
            
        // println('a'.toInt) // 97

        if (args.length > 1) {
            var wordToEncode : String = args(0);
            var step : String = args(1);
            println(wordToEncode.map(c => changeCharacter(c,step.toInt)));
        }
        else {
            println("Il faut entrer au minimum 2 arguments")
        }

        // println("acv".contains('c'))
        // println("acv".indexOf('c'))

        // ON NE FAIT DE TRY CATCH QUE QUAND ON NE SAIT PAS CE QUI PEUT ARRIVER

        // try {
        //     var wordToEncode : String = args(0);
        //     var step : String = args(1);
        //     println(wordToEncode.map(c => changeCharacter(c,step.toInt)));
        // }
        // catch {
        //     case e : NumberFormatException => handleNbException("Le type des paramètres n'est pas bon :\n" + e)
        //     case e : ArrayIndexOutOfBoundsException => handleParamException("Il faut entrer au minimum 2 arguments :\n" + e)
        //     case other : Throwable => println(other)
        // }
        // finally {
        //     // println("This code is always executed !")
        // }
            
    }

    def changeCharacter(c: Char, step: Int): Char = {
        if (step < 0) {
            return ((c.toInt + step.abs) % 256).toChar
        }
        return ((c.toInt + step) % 256).toChar
    }

    // def handleNbException(str: String): Unit = {
    //     println(str)
    // }

    // def handleParamException(str: String): Unit = {
    //     println(str)
    // }
}