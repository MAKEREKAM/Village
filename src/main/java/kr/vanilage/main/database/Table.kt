package kr.vanilage.main.database

class Table(vararg columns : Any) {
    val rows = ArrayList<Row>()
    val columns = ArrayList<Any>()
}