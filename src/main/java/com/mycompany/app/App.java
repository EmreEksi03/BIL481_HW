package com.mycompany.app;

import static spark.Spark.get;
import static spark.Spark.port;
import static spark.Spark.post;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import spark.ModelAndView;
import spark.template.mustache.MustacheTemplateEngine;


public class App {

    public static int findCommonElementsCount(Integer[] arr1, ArrayList<Integer> arr2, int target) {
        System.out.println(arr1);
        System.out.println(arr2);
        System.out.println(target);
        if (arr1 == null || arr2 == null) {
            return 0; // Return 0 for null arrays
        }

        int count = 0;
        Map<Integer, Integer> elementCount = new HashMap<>(); // Track element counts in arr1

        // Build a map to store the count of each element in arr1
        for (int num : arr1) {
            elementCount.put(num, elementCount.getOrDefault(num, 0) + 1);
        }

        for (int num : arr1) {
            if (elementCount.get(num) > 0 && arr2.contains(num) && num == target) {
                count++;
                elementCount.put(num, elementCount.get(num) - 1); // Decrement element count in arr1
            }
        }

        return count;
    }

    public static void main(String[] args) {
        port(getHerokuAssignedPort());

        get("/", (req, res) -> "Hello, World");

        post("/compute", (req, res) -> {
            String input1 = req.queryParams("input1");
            java.util.Scanner sc1 = new java.util.Scanner(input1);
            sc1.useDelimiter("[;\r\n]+");
            java.util.ArrayList<Integer> inputList = new java.util.ArrayList<>();
            while (sc1.hasNext()) {
                int value = Integer.parseInt(sc1.next().replaceAll("\\s",""));
                inputList.add(value);
            }

            String input2 = req.queryParams("input2").replaceAll("\\s","");
            int input2AsInt = Integer.parseInt(input2);

            int result = App.findCommonElementsCount(inputList.toArray(new Integer[0]), inputList, input2AsInt);

            Map map = new HashMap();
            map.put("result", result);
            return new ModelAndView(map, "compute.mustache");
        }, new MustacheTemplateEngine());

        get("/compute", (rq, rs) -> {
            Map map = new HashMap();
            map.put("result", "not computed yet!");
            return new ModelAndView(map, "compute.mustache");
        }, new MustacheTemplateEngine());
    }
    static int getHerokuAssignedPort() {
        ProcessBuilder processBuilder = new ProcessBuilder();
        if (processBuilder.environment().get("PORT") != null) {
            String port = processBuilder.environment().get("PORT");
            System.out.println("PORT bulıundu " + port);
            return Integer.parseInt(port);
        }
        System.out.println("PORT bulıunamadı " + 4567);
        return 4567; //return default port if heroku-port isn't set (i.e. on localhost)
    }
}

