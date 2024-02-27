import React, {useEffect, useState} from 'react';
import logo from './logo.svg';
import './App.css';

interface Product{
  id: string;
  name: string;
  sku: string;
}
const ProductComponent = (
  {product}:
  {product: Product}
) => {
  return (
    <div className={"product"}>
      <h1>{product.id}</h1>
      <h2>{product.name}</h2>
      <h3>{product.sku}</h3>
    </div>
)
}

function App() {
  const [products, setProducts] = useState<Product[]>([])
  useEffect(() => {
    fetch('http://localhost:8080/products')
      .then((res) => res.json())
      .then((data) => setProducts(data as Product[]))
      .catch(e => console.error(e))
  }, []);
  return (
    <div className="App">
      <div className={"products"}>
        {products.map((p) => (
          <ProductComponent product={p} />
        ))}
      </div>
    </div>
  );
}

export default App;
