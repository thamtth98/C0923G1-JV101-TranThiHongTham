import Header from "../Header/Header";
import Body from "../Body/Body";
import ControlledCarousel from "../Carosel/Carosel";
import Footer from "../Footer/Footer";
import React, {useEffect} from "react";


function Home() {

    return (
        <>
            <Header/>
            <Body/>
            <ControlledCarousel/>
            <Footer/>
        </>)
};

export default Home;