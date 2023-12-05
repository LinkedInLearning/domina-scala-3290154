import org.apache.spark.sql.{SparkSession, Row}
import org.apache.spark.sql.types.{
  StructType,
  StructField,
  StringType,
  IntegerType
}

@main def main() = {
  val estructuraDatosPersonal = new StructType()
    .add(StructField("id", IntegerType, true))
    .add(StructField("nombre", StringType, true))
    .add(StructField("apellido", StringType, true))
    .add(StructField("email", StringType, true))

  val spark = SparkSession.builder
    .appName("Dataframes")
    .master("local")
    .getOrCreate()

  val datosPersonal = Seq(
    Row(15379, "Hernan", "Maldonado", "hmaldonado@kinetecoinc.com"),
    Row(15419, "Carlos", "Zambrano", "czambrano@kinetecoinc.com"),
    Row(15420, "Elena", "Domínguez", "edomínguez@kinetecoinc.com"),
    Row(46556, "Teresa", "Benítez", "tbenítez@kinetecoinc.com")
  )

  val df = spark.createDataFrame(
    spark.sparkContext.parallelize(datosPersonal),
    estructuraDatosPersonal
  )
  df.show()

  val valoresFiltrados = List(15379, 46556)
}
