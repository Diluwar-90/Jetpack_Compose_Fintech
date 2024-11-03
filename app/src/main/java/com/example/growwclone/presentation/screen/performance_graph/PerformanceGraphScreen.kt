package com.example.growwclone.presentation.screen.performance_graph

import androidx.compose.runtime.Composable
import androidx.compose.ui.viewinterop.AndroidView
import com.example.growwclone.data.model.Stock
import com.github.mikephil.charting.charts.LineChart
import com.github.mikephil.charting.data.Entry
import com.github.mikephil.charting.data.LineData
import com.github.mikephil.charting.data.LineDataSet

@Composable
fun PerformanceGraphScreen(stock: Stock) {
    val entries = ArrayList<Entry>().apply {
        add(Entry(0f, 150f))
        add(Entry(1f, 155f))
        add(Entry(2f, 160f))
    }

    AndroidView(factory = {
        LineChart(it).apply {
            data = LineData(LineDataSet(entries, "Price History"))
        }
    })
}
