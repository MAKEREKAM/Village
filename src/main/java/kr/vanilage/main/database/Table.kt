package kr.vanilage.main.database

class Table(vararg column : Any) {
    val rows = ArrayList<Row>()
    val columns = column

    fun addRow(row : Row) {
        rows.add(row)
    }

    fun deleteRow(vararg conditions : ConditionMaker) {

    }
}