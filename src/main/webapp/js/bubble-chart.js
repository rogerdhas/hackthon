/*$(document).ready(function () {
	var actualData = "";
	$.each(bubbleData, function(i, bubbleVal) {
		actualData = actualData + "{text: \""+ bubbleVal.text+"\", count: \""+ bubbleVal.value+"\"},";
	});
	var properData = "[" + actualData + "]";
	//alert(properData);
	$('#sample').val(properData);
	var bubbleChart = new d3.svg.BubbleChart({
    supportResponsive: true,
    //container: => use @default
    size: 600,
    //viewBoxSize: => use @default
    innerRadius: 600 / 3.5,
    //outerRadius: => use @default
    radiusMin: 50,
    //radiusMax: use @default
    //intersectDelta: use @default
    //intersectInc: use @default
    //circleColor: use @default    
    data: {
      items: [
              {text: "Java", count: "236"},{text: ".Net", count: "382"},
              {text: "Php", count: "170"},
              {text: "Ruby", count: "123"},
              {text: "D", count: "12"},
              {text: "Python", count: "170"},
              {text: "C/C++", count: "382"},
              {text: "Pascal", count: "10"},
              {text: "Something", count: "170"},
              document.write(actualData)
            ],
      eval: function (item) {return item.count;},
      classed: function (item) {return item.text.split(" ").join("");}
    },
    plugins: [
      {
        name: "central-click",
        options: {
          text: "",
          style: {
            "font-size": "12px",
            "font-style": "italic",
            "font-family": "Source Sans Pro, sans-serif",
            //"font-weight": "700",
            "text-anchor": "middle",
            "fill": "white"
          },
          attr: {dy: "65px"},
          centralClick: function() {
            //alert("Here is more details!!");
          }
        }
      },
      {
        name: "lines",
        options: {
          format: [
            {// Line #0
              textField: "count",
              classed: {count: true},
              style: {
                "font-size": "28px",
                "font-family": "Source Sans Pro, sans-serif",
                "text-anchor": "middle",
                fill: "white"
              },
              attr: {
                dy: "0px",
                x: function (d) {return d.cx;},
                y: function (d) {return d.cy;}
              }
            },
            {// Line #1
              textField: "text",
              classed: {text: true},
              style: {
                "font-size": "14px",
                "font-family": "Source Sans Pro, sans-serif",
                "text-anchor": "middle",
                fill: "white"
              },
              attr: {
                dy: "20px",
                x: function (d) {return d.cx;},
                y: function (d) {return d.cy;}
              }
            }
          ],
          centralFormat: [
            {// Line #0
              style: {"font-size": "50px"},
              attr: {}
            },
            {// Line #1
              style: {"font-size": "30px"},
              attr: {dy: "40px"}
            }
          ]
        }
      }]
  });
});*/



	$(document).ready(function () {  
	var bubbleChart = new d3.svg.BubbleChart({ 
   supportResponsive: true, 
   size: 600, 
   innerRadius: 600 / 3.5, 
   radiusMin: 50, 
   data: { 
     items: [ 
 {text: "Age(51-60)", count: "132"},
  {text: "Age(10-20)", count: "78"},
  {text: "Age(41-50)", count: "116"},
  {text: "Age(31-40)", count: "135"},
  {text: "Age(21-30)", count: "139"},
            ], 
     eval: function (item) {return item.count;}, 
     classed: function (item) {return item.text.split(" ").join("");} 
   }, 
   plugins: [ 
     { 
       name: "central-click", 
       options: { 
         text: "", 
         style: { 
           "font-size": "12px", 
           "font-style": "italic", 
           "font-family": "Source Sans Pro, sans-serif", 
           "text-anchor": "middle", 
           "fill": "white" 
         }, 
         attr: {dy: "65px"}, 
          centralClick: function() { 
          } 
        } 
      }, 
      { 
        name: "lines", 
       options: { 
         format: [ 
            { 
              textField: "count", 
              classed: {count: true}, 
             style: { 
               "font-size": "28px", 
               "font-family": "Source Sans Pro, sans-serif", 
               "text-anchor": "middle", 
               fill: "white" 
             }, 
             attr: { 
               dy: "0px", 
               x: function (d) {return d.cx;}, 
               y: function (d) {return d.cy;} 
             } 
           }, 
           { 
             textField: "text", 
             classed: {text: true}, 
   style: { 
      "font-size": "14px", 
       "font-family": "Source Sans Pro, sans-serif", 
        "text-anchor": "middle", 
         fill: "white" 
        }, 
         attr: { 
   dy: "20px", 
    x: function (d) {return d.cx;}, 
     y: function (d) {return d.cy;} 
    } 
   } 
  ], 
   centralFormat: [ 
 { 
    style: {"font-size": "50px"}, 
     attr: {} 
    }, 
     { 
       style: {"font-size": "30px"}, 
         attr: {dy: "40px"} 
        } 
       ] 
      } 
     }] 
  }); 
 });