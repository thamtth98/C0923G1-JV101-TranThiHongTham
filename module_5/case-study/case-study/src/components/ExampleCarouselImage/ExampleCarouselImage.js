import React from 'react';
// import from from "../../../public/img/carosel-2.jpg"

function ExampleCarouselImage({ text }) {
    return (
        <div>
            <img src="img/store-product-1.jpg" alt="Example" />
            <p>{text}</p>
        </div>
    );
}

export default ExampleCarouselImage;