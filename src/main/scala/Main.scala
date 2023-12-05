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
}
