package kr.vanilage.main.database

class Table(vararg column : Any) {
    val rows = ArrayList<Row>()
    val columns = column

    fun addRow(row : Row) {
        rows.add(row)
    }

    fun deleteRow(vararg conditions : ConditionMaker) {
        for (i in rows.size - 1 downTo 0) {
            var delete = true

            for (j in conditions) {
                if (rows[i].columns[j.index] != j.value) {
                    delete = false
                }
            }

            if (delete) {
                rows.removeAt(i)
            }
        }
    }

    fun updateRow(index : Int, value : Any, vararg conditions : ConditionMaker) {
        for (i in rows.size - 1 downTo 0) {
            var update = true

            for (j in conditions) {
                if (rows[i].columns[j.index] != j.value) {
                    update = false
                }
            }

            if (update) {
                val row = rows[i].columns.toMutableList()
                rows.removeAt(i)

                row[index] = value

                addRow(Row(*row.toTypedArray()))
            }
        }
    }
}