object HelloWorld  {  

    def main(args: Array[String]): Unit = {  
        /*
            Commentaire multi-lignes
        */

        // Commentaire de fin de ligne

        // Afficher le nom passé en paramètre :
        val name = scala.io.StdIn.readLine("Ton nom : ")
        println("Hello " + name)

        val name2 = args(0);
        println("Hello, " + name2)

        // Afficher le max de 2 nombres :
        val myVal : Int = 3
        val myVal2 : Int = 4
        if (myVal > myVal2) {
            println("Avec un if : " + myVal)
        }
        else {
            println("Avec un if : " + myVal2)
        }

        println("Avec la fonction max et 2 nombres : " + getMax(myVal, myVal2))

        println("Avec la fonction max et une liste : " + getMaxList(List(myVal, myVal2)))

    }

    def getMax(x: Int, y: Int): Int = {
        return x.max(y)
    }

    def getMaxList(l: List[Int]): Int = {
        return l.max
    }
}  