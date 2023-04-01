import {IProductContract} from "../contracts/ProductContract";

export abstract class ProductTemplate implements IProductContract{
    public Name: string="";
    public Price:number=0;
    public Qty:number=0;
    public CategoryName:string="";
    public abstract Total():number;
    public abstract Print():void;
}