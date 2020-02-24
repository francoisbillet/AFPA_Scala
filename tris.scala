object tris {

    def main(args: Array[String]): Unit = {

        var tab = Array(1,3,5,7,4,-2,9);
        // scala.util.Sorting.quickSort(tab)
        // tab = tab.sorted
        
        // println("Sorted Array : " + tab.mkString("[", ", ", "]"))

        // Tri à bulles :

        var i = 0;
        var j = 0;
        var tbPasTrie = true;
        var cpt = 1;
        while (tbPasTrie) {
            tbPasTrie = false;
            for (i <- 0 to tab.size - cpt - 1) {
                // On fait remonter les plus grands éléments vers la fin du tableau
                if (tab(i) > tab(i+1)) {
                    permuterValeurs(tab, i, i+1)
                    tbPasTrie = true
                }
            }
            cpt += 1;
        }

        println("Tri à bulles : " + tab.mkString("[", ", ", "]"))

        var tab2 = Array(1,3,5,7,4,-2,9);

        // Tri par sélection :

        var m = 0
        var n = 0
        var max = 0
        var i_max = 0
        for (m <- 0 to tab2.size - 1) {
            max = tab2(0)
            i_max = 0
            for (n <- 0 to tab2.size - m - 1) {
                if (tab2(n) > max) {
                    max = tab2(n)
                    i_max = n
                }
            }
            permuterValeurs(tab2, i_max, tab2.size-m-1)
        }

        println("Tri par sélection : " + tab2.mkString("[", ", ", "]"))

        var tab3 = Array(1,3,5,7,4,-2,9);

        // Tri par insertion :

        var k = 0;
        var l = 0;
        var x = 0;
        for (k <- 1 to tab3.size - 1) {
            x = tab3(k)
            l=k;
            while (l>0 && tab3(l-1) > x) {
                tab3(l) = tab3(l-1)
                l = l-1
            }
            tab3(l) = x 
        }

        println("Tri par insertion : " + tab3.mkString("[", ", ", "]"))

        // Tri fusion :

        var tab4 = Array(1,3,5,7,4,-2,9);

        println("Tri fusion : " + triFusion(tab4).mkString("[", ", ", "]"))
        
    }

    def fusion(tab1: Array[Int], tab2: Array[Int]): Array[Int] = {
        if (tab1.size == 0) {
            return tab2
        }
        else if (tab2.size == 0) {
            return tab1
        }
        else {
            return fusion(tab1.drop(1), insert(tab1(0), tab2))
        }
    }

    def insert(element: Int, tab: Array[Int]): Array[Int] = {
        if (tab.length == 0) {
            return Array(element);
        }
        else if (element <= tab(0)) {
            return element +: tab;
        }
        else {
            return tab(0) +: insert(element, tab.drop(1));
        }
    }

    def triFusion(tab: Array[Int]): Array[Int] = {
        if (tab.length == 0 || tab.length == 1) {
            return tab
        }
        else {
            return fusion(triFusion(tab.drop(tab.length/2)), triFusion(tab.dropRight(tab.length/2)))
        }
    }


    def permuterValeurs(tab: Array[Int], x: Int, y: Int): Unit = {
        var temp = 0;
        temp = tab(x)
        tab(x) = tab(y)
        tab(y) = temp
    }

}