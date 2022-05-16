import React from 'react';
import { StylesProvider } from '@material-ui/styles'
import { CssBaseline } from '@material-ui/core'
import globalStyle from  './commons/styles/global-style'


function App() {
  return (
    <StylesProvider injectFirst>
      <CssBaseline />
      <globalStyle />
    </StylesProvider>
  );
}

export default App;