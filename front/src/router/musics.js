export default [
  {
    path: '/music',
    name: 'Music',
    component: () => import('@/components/music/Music'),
  },
  {
    path: '/music/:musicId/info',
    name: 'MusicInfo',
    component: () => import('@/components/music/post/MusicInfo'),
    props: true,
  },
]