
object Jumbo extends SparkJob {

  def main(args: Array[String]): Unit = {
    val conf = new SparkConf().setMaster("local[*]").setAppName("DataStatsExecution")
    val jobConfig = ConfigFactory.load()
    val sc = new SparkContext(conf)
    runJob(sc,jobConfig)
  }
}