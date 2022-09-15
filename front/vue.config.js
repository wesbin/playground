module.exports = {
  devServer: {
    overlay: false,
  },
  css: {
    loaderOptions: {
      scss: {
        additionalData: `
          @import '@/assets/css/font.scss';
          @import '@/assets/css/color.scss';
        `,
      },
    },
  },
};
