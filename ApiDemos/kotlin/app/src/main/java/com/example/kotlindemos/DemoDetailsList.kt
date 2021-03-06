/*
 * Copyright 2018 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.kotlindemos

/**
 * A list of all the demos we have available.
 */
class DemoDetailsList {
    companion object {
        val DEMOS = listOf<DemoDetails>(
                DemoDetails(R.string.polygon_demo_label, R.string.polygon_demo_details,
                        PolygonDemoActivity::class.java),
                DemoDetails(R.string.camera_demo_label, R.string.camera_demo_description,
                        CameraDemoActivity::class.java),
                DemoDetails(R.string.markers_demo_label, R.string.markers_demo_description,
                        MarkerDemoActivity::class.java),
                DemoDetails(R.string.layers_demo_label, R.string.layers_demo_description,
                        LayersDemoActivity::class.java),
                DemoDetails(R.string.polyline_demo_label, R.string.polyline_demo_description,
                        PolylineDemoActivity::class.java),
                DemoDetails(R.string.tags_demo_label, R.string.tags_demo_details,
                        TagsDemoActivity::class.java),
                DemoDetails(R.string.region_demo_label, R.string.region_demo_details,
                        VisibleRegionDemoActivity::class.java)
        )
    }
}