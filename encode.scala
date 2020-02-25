import scala.util.matching.Regex

object encode {

    def main(args: Array[String]): Unit = {

        if (args.length > 1) {
            var wordToEncode : String = args(0);
            var step : String = args(1);
            println(wordToEncode.map(c => changeCharacter(c,step.toInt)));
        }
        else {
            println("Il faut entrer au minimum 2 arguments")
        }
            
    }

    def changeCharacter(c: Char, step: Int): Char = {
        if (step < 0) {
            return ((c.toInt + step.abs) % 256).toChar
        }
        return ((c.toInt + step) % 256).toChar
    }
}