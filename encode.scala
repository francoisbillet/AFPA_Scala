import scala.util.matching.Regex

object encode {

    def main(args: Array[String]): Unit = {
            
        // println('a'.toInt) // 97

        try {
            var wordToEncode : String = args(0);
            var step : String = args(1);
            println(wordToEncode.map(c => changeCharacter(c,step.toInt)));
        }
        catch {
            case nb : NumberFormatException => handleNbException("Le type des paramètres n'est pas bon")
            case param : ArrayIndexOutOfBoundsException => handleParamException("Il faut entrer au minimum 2 arguments")
            case other : Throwable => println(other)
        }
        finally {
            // println("This code is always executed !")
        }
            
    }

    def changeCharacter(c: Char, step: Int): Char = {
        if (step < 0 || c.toInt + step > 127) {
            throw new Exception("Décalage trop grand !")
        }
        return (c.toInt + step).toChar
    }

    def handleNbException(str: String): Unit = {
        println(str)
    }

    def handleParamException(str: String): Unit = {
        println(str)
    }
}