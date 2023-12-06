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

  val estructuraDatosPuesto = new StructType()
    .add(StructField("id", IntegerType, true))
    .add(StructField("puesto", StringType, true))
    .add(StructField("estado", StringType, true))

  val spark = SparkSession.builder
    .appName("Dataframes")
    .master("local")
    .getOrCreate()

  val datosPersonal = Seq(
    Row(15379, "Hernan", "Maldonado", "hmaldonado@kinetecoinc.com"),
    Row(15419, "Carlos", "Zambrano", "czambrano@kinetecoinc.com"),
    Row(15420, "Elena", "Domínguez", "edomínguez@kinetecoinc.com"),
    Row(46556, "Teresa", "Benítez", "tbenítez@kinetecoinc.com"),
    Row(46555, "Sonia", "Blanco", "sblanco@kinetecoinc.com"),
    Row(46559, "Ernesto", "García", "egarcía@kinetecoinc.com"),
    Row(15428, "Rodrigo", "Torres", "rtorres@kinetecoinc.com"),
    Row(15429, "Roberto", "Molina", "rmolina@kinetecoinc.com"),
    Row(47130, "Nuria", "Flores", "nflores@kinetecoinc.com"),
    Row(32117, "Patricia", "Bermúdez", "pbermúdez@kinetecoinc.com"),
    Row(32313, "Clara", "Ortiz", "cortiz@kinetecoinc.com")
  )

  val datosPuesto = Seq(
    Row(15379, "Ingeniero I", "Texas"),
    Row(15419, "Vicetresidente RRHH", "California"),
    Row(15420, "Manufacturación y distribución", "California"),
    Row(46556, "Geólogo IV", "Maryland"),
    Row(15428, "Analista de sistemas IV", "Oklahoma"),
    Row(15429, "Asistente administrativo", "Los Angeles"),
    Row(47130, "Técnico de instalaciones solares", "Los Angeles"),
    Row(32117, "Ingeniero de diseño", "New York"),
  )

  val dfPersonal = spark.createDataFrame(
    spark.sparkContext.parallelize(datosPersonal),
    estructuraDatosPersonal
  )
  dfPersonal.show()

  val dfPuesto = spark.createDataFrame(
    spark.sparkContext.parallelize(datosPuesto),
    estructuraDatosPuesto
  )
  dfPuesto.show()

}
