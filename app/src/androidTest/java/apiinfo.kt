package bd.ac.ru.cse3162
data class apiinfo (
    val data: List<Datum>,
    val count: Long
)

data class Datum (
    val rh: Long,
    val pod: String,
    val lon: Double,
    val pres: Double,
    val timezone: String,
    val obTime: String,
    val countryCode: String,
    val clouds: Long,
    val ts: Long,
    val solarRAD: Long,
    val stateCode: String,
    val cityName: String,
    val windSpd: Long,
    val windCdirFull: String,
    val windCdir: String,
    val slp: Double,
    val vis: Long,
    val hAngle: Long,
    val sunset: String,
    val dni: Long,
    val dewpt: Double,
    val snow: Long,
    val uv: Long,
    val precip: Long,
    val windDir: Long,
    val sunrise: String,
    val ghi: Long,
    val dhi: Long,
    val aqi: Long,
    val lat: Double,
    val weather: Weather,
    val datetime: String,
    val temp: Double,
    val station: String,
    val elevAngle: Double,
    val appTemp: Double
)

data class Weather (
    val icon: String,
    val code: Long,
    val description: String
)

