package com.example.growwclone.presentation.screen.stock_chart

import androidx.compose.runtime.Composable
import androidx.compose.ui.viewinterop.AndroidView
import com.github.mikephil.charting.charts.LineChart
import com.github.mikephil.charting.data.Entry
import com.github.mikephil.charting.data.LineData
import com.github.mikephil.charting.data.LineDataSet

@Composable
fun StockChartScreen() {
    val entries = ArrayList<Entry>().apply {
        add(Entry(0f, 150f))
        add(Entry(1f, 160f))
        add(Entry(2f, 170f))
    }

    AndroidView(factory = {
        LineChart(it).apply {
            data = LineData(LineDataSet(entries, "Stock Price"))
        }
    })
}
