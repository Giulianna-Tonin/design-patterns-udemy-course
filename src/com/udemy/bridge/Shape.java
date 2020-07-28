//package com.udemy.bridge;
//import com.google.inject.AbstractModule;
//
//
//abstract class Shape {
//
//    protected Renderer renderer;
//
//    public Shape(Renderer renderer) {
//        this.renderer = renderer;
//    }
//
//    public abstract String getName();
//}
//
//class Triangle extends Shape {
//
//    public Triangle(Renderer renderer) {
//        super(renderer);
//    }
//
//    @Override
//    public String getName()
//    {
//        return "Triangle";
//    }
//}
//
//class Square extends Shape{
//
//    public Square(Renderer renderer) {
//        super(renderer);
//    }
//
//    @Override
//    public String getName()
//    {
//        return "Square";
//    }
//}
//
//class ShapeModule extends AbstractModule
//{
//    @Override
//    protected void configure()
//    {
//        bind(Renderer.class).to(VectorRenderer.class);
//    }
//}
//
////class VectorSquare extends Square{
////    @Override
////    public String toString()
////    {
////        return String.format("Drawing %s as lines", getName());
////    }
////}
////
////class RasterSquare extends Square{
////    @Override
////    public String toString()
////    {
////        return String.format("Drawing %s as pixels", getName());
////    }
////}
//
//
//// imagine VectorTriangle and RasterTriangle are here too
//
//interface Renderer{
//
//    public String whatToRenderAs();
//
//}
//
//class VectorRenderer implements Renderer{
//
//    @Override
//    public String whatToRenderAs() {
//        return "Drawing xx as lines";
//    }
//
//
//}
//
//class RasterRenderer implements Renderer{
//
//    @Override
//    public String whatToRenderAs() {
//        return "Drawing xx as pixels";
//    }
//
//
//}