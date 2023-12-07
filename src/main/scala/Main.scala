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
    .add(StructField("puesto", StringType, true))
    .add(StructField("estado", StringType, true))

  val spark = SparkSession.builder
    .appName("Dataframes")
    .master("local")
    .getOrCreate()

  val datosPersonal = Seq(
    Row(
      15379,
      "Hernan",
      "Maldonado",
      "hmaldonado@kinetecoinc.com",
      "Ingeniero I",
      "Texas"
    ),
    Row(
      15419,
      "Carlos",
      "Zambrano",
      "czambrano@kinetecoinc.com",
      "Vicetresidente RRHH",
      "California"
    ),
    Row(
      15420,
      "Elena",
      "Domínguez",
      "edomínguez@kinetecoinc.com",
      "Manufacturación y distribución",
      "California"
    ),
    Row(
      46556,
      "Teresa",
      "Benítez",
      "tbenítez@kinetecoinc.com",
      "Geólogo IV",
      "Maryland"
    )
  )

  val df = spark.createDataFrame(
    spark.sparkContext.parallelize(datosPersonal),
    estructuraDatosPersonal
  )
  df.show()

  val ruta = "./resultados"

  df.write
    .option("header", "true")
    .csv(ruta)

  println("Dataframe exportado")
}
