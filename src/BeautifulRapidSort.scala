/**
  * A Quick sort by using beauty of scala
  * @author Abdou Khadre DIOP
  * @since 26/05/2017
  */
object BeautifulRapidSort {

  def sort(tab: Array[Int]): Array[Int]={
    if (tab.length<1) tab
    else {
      val pivot = tab(tab.length/2)
      Array.concat(sort(tab filter(pivot >)),
        tab filter(pivot == ),
        sort(tab filter(pivot <))
      )
    }
  }

  def main(args: Array[String]) {
    val tab = Array(1,3,6,4,7,9,23,13,1,2,1,4,66)
    val newTab = sort(tab)

    for (t <- newTab){
      println(t)
    }
  }
}
