module.exports = {
  //history模式下使用 '/'
  publicPath: '/',
  devServer: {
    open: true,
    proxy: {
      '/api': {
        target: 'https://localhost:7001/', // 本地后端地址
        changeOrigin: true, //允许跨域
        pathRewrite: {
          '^/api': ''
        }
      }
    }
  }
}
