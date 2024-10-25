import React from "react";
import { BrowserRouter as Router, Routes, Route } from "react-router-dom";
import LocationSender from "./LocationSender";
import SuccessPage from "./SuccessPage";

export default function App() {
  return (
    <Router>
      <Routes>
        <Route path="/" element={<LocationSender />} />
        <Route path="/success" element={<SuccessPage />} />
      </Routes>
    </Router>
  );
}
