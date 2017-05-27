/**
  * A simple quick sort
  * @author Abdou Khadre DIOP
  * @since 26/05/2017
  */
object SimpleRapidSort {

  def sort(tab: Array[Int]): Unit ={

    def swap(i : Int, j : Int): Unit ={
      val temp=tab(i)
      tab(i)=tab(j)
      tab(j)=temp
    }

    def sorting(l:Int, r:Int): Unit ={
      val pivot =tab((l+r)/2)
      var i = l
      var j = r
      while (i<=j){
        while (tab(i)<pivot) i+=1
        while (tab(j)>pivot) j-=1
        while(i<=j){
          swap(i,j)
          i+=1
          j-=1
        }
      }
      if(l<j) sorting(l,j)
      if(l<r) sorting(i,r)
    }
    sorting(0,tab.length-1)
  }

  def main(args: Array[String]) {
    val tab = Array(1,3,6,4,7,9,23,13,1,2,1,4,66)
    sort(tab)

    for (t <- tab){
      println(t)
    }
  }

}
